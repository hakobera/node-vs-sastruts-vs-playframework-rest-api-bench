/**
 * Module dependencies.
 */

var cluster = require('cluster')
  , express = require('express')
  , os = require('os')
  , Resource = require('express-resource');

var app = module.exports = express.createServer();

// Configuration

app.configure(function(){
  app.use(express.bodyParser());
  app.use(express.methodOverride());
  app.use(app.router);
  app.use(express.static(__dirname + '/public'));
});

app.configure('development', function(){
  app.use(express.errorHandler({ dumpExceptions: true, showStack: true }));
});

app.configure('production', function(){
  app.use(express.errorHandler());
});

// Routes
app.resource('orders', require('./resources/Order'));
if (cluster.isMaster) {
  var workers = [];

	var numChildren = os.cpus().length * 2;
    
  for (var i = 0; i < numChildren; i++) {
    workers.push(cluster.fork());
  }
  
  cluster.on('death', function (worker) {
    console.warn('Worker ' + worker.pid + ' died');

    workers = workers.filter(function (w) {
      return worker !== w;
    });

    workers.push(cluster.fork());
  });
} else {
	app.listen(3000);
	console.log("Express server listening on port %d in %s mode", process.env.PORT, app.settings.env);
}
