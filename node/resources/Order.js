var db = require('../lib/db');

/*
 * List
 * @GET /model/
 * @returns JSON list of records
 */
exports.index = function(request, response) {
  db.findAll(function(err, rows) {
    if (err) {
      response.send(err, 500);
    } else {
      response.json(rows);
    }
  });
};

/*
 * Show by Id
 * @GET /model/:id
 * @returns JSON requested record
 */
exports.show = function(request, response) {
  var id = request.params.order;
  db.findById(id, function(err, rows) {
    if (err) {
      response.send(err, 500);
    } else {
      response.json(rows);
    }
  });
};