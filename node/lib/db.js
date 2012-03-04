var pg = require('pg');

var dbUrl = "tcp://bunny:tiger@localhost/api_bench";

exports.findAll = function(callback) {
  pg.connect(dbUrl, function(err, client) {
    client.query("select * from ORDERS", function(err, result) {
      if (err) return callback(err);
      console.log("Row count: %d",result.rows.length);
      callback(null, result.rows);
    });
  });
};

exports.findById = function(id, callback) {
  pg.connect(dbUrl, function(err, client) {
    client.query("select * from ORDERS where id = $1", [ id ], function(err, result) {
      if (err) return callback(err);
      console.log("Row count: %d",result.rows.length);
      callback(null, result.rows[0]);
    });
  });
};
