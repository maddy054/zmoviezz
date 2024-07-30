'use strict';

define('zmovizz/tests/app.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | app');

  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });

  QUnit.test('components/create-comp.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/create-comp.js should pass ESLint\n\n64:11 - \'$\' is not defined. (no-undef)\n89:17 - Unexpected console statement. (no-console)\n96:11 - Unexpected console statement. (no-console)\n97:11 - \'$\' is not defined. (no-undef)\n115:16 - \'data\' is defined but never used. (no-unused-vars)\n118:16 - \'error\' is defined but never used. (no-unused-vars)\n133:21 - \'$\' is not defined. (no-undef)\n146:26 - \'reject\' is not defined. (no-undef)\n163:17 - Unexpected console statement. (no-console)\n168:17 - Unexpected console statement. (no-console)\n179:20 - Unexpected console statement. (no-console)\n184:20 - Unexpected console statement. (no-console)');
  });

  QUnit.test('components/individual-movie.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/individual-movie.js should pass ESLint\n\n32:10 - \'$\' is not defined. (no-undef)\n43:14 - \'error\' is defined but never used. (no-unused-vars)\n44:17 - Unexpected console statement. (no-console)\n44:38 - \'data\' is not defined. (no-undef)');
  });

  QUnit.test('components/movie-list.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/movie-list.js should pass ESLint\n\n32:13 - \'$\' is not defined. (no-undef)\n45:18 - \'error\' is defined but never used. (no-unused-vars)\n46:21 - Unexpected console statement. (no-console)\n46:42 - \'data\' is not defined. (no-undef)');
  });

  QUnit.test('components/side-nav.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/side-nav.js should pass ESLint\n\n');
  });

  QUnit.test('components/theater-seating.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/theater-seating.js should pass ESLint\n\n41:17 - Unexpected console statement. (no-console)');
  });

  QUnit.test('components/top-nav.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/top-nav.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/login.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/login.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz/home.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/home.js should pass ESLint\n\n30:17 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/zmoviezz/login.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/login.js should pass ESLint\n\n20:17 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/zmoviezz/movies.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/movies.js should pass ESLint\n\n19:17 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/zmoviezz/shows.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/shows.js should pass ESLint\n\n28:8 - Unexpected console statement. (no-console)\n52:18 - \'error\' is defined but never used. (no-unused-vars)\n70:13 - Unexpected console statement. (no-console)\n86:18 - \'error\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('helpers/check-exist.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/check-exist.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/concat.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/concat.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/equal.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/equal.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/millis-to-date.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/millis-to-date.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/millis-to-full-date.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/millis-to-full-date.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/millis-to-month.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/millis-to-month.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/millis-to-time.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/millis-to-time.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/range.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/range.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/split.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/split.js should pass ESLint\n\n');
  });

  QUnit.test('resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'resolver.js should pass ESLint\n\n');
  });

  QUnit.test('router.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'router.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/home.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/home.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/login.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/login.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/movies.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'routes/zmoviezz/movies.js should pass ESLint\n\n6:20 - \'Promise\' is not defined. (no-undef)\n7:13 - \'$\' is not defined. (no-undef)\n18:21 - Unexpected console statement. (no-console)\n18:42 - \'data\' is not defined. (no-undef)');
  });

  QUnit.test('routes/zmoviezz/shows.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/shows.js should pass ESLint\n\n');
  });

  QUnit.test('services/authenticate.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/authenticate.js should pass ESLint\n\n9:18 - \'Promise\' is not defined. (no-undef)\n10:9 - \'$\' is not defined. (no-undef)\n29:18 - \'Promise\' is not defined. (no-undef)\n30:9 - \'$\' is not defined. (no-undef)\n50:18 - \'Promise\' is not defined. (no-undef)\n50:43 - \'reject\' is defined but never used. (no-unused-vars)\n51:9 - \'$\' is not defined. (no-undef)\n66:13 - \'reject\' is not defined. (no-undef)');
  });

  QUnit.test('services/movie-fetch.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/movie-fetch.js should pass ESLint\n\n9:20 - \'Promise\' is not defined. (no-undef)\n10:9 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/session.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/session.js should pass ESLint\n\n10:5 - Unexpected console statement. (no-console)\n12:5 - Unexpected console statement. (no-console)\n14:5 - Unexpected console statement. (no-console)');
  });

  QUnit.test('services/show-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/show-crud.js should pass ESLint\n\n7:20 - \'Promise\' is not defined. (no-undef)\n8:13 - \'$\' is not defined. (no-undef)\n26:20 - \'Promise\' is not defined. (no-undef)\n27:13 - \'$\' is not defined. (no-undef)\n48:18 - \'Promise\' is not defined. (no-undef)\n49:9 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/theater-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/theater-crud.js should pass ESLint\n\n6:20 - \'Promise\' is not defined. (no-undef)\n7:13 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/time-converter.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'services/time-converter.js should pass ESLint\n\n');
  });
});
define('zmovizz/tests/helpers/destroy-app', ['exports'], function (exports) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.default = destroyApp;
  function destroyApp(application) {
    Ember.run(application, 'destroy');
  }
});
define('zmovizz/tests/helpers/module-for-acceptance', ['exports', 'qunit', 'zmovizz/tests/helpers/start-app', 'zmovizz/tests/helpers/destroy-app'], function (exports, _qunit, _startApp, _destroyApp) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });

  exports.default = function (name) {
    var options = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : {};

    (0, _qunit.module)(name, {
      beforeEach: function beforeEach() {
        this.application = (0, _startApp.default)();

        if (options.beforeEach) {
          return options.beforeEach.apply(this, arguments);
        }
      },
      afterEach: function afterEach() {
        var _this = this;

        var afterEach = options.afterEach && options.afterEach.apply(this, arguments);
        return resolve(afterEach).then(function () {
          return (0, _destroyApp.default)(_this.application);
        });
      }
    });
  };

  var resolve = Ember.RSVP.resolve;
});
define('zmovizz/tests/helpers/resolver', ['exports', 'zmovizz/resolver', 'zmovizz/config/environment'], function (exports, _resolver, _environment) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });


  var resolver = _resolver.default.create();

  resolver.namespace = {
    modulePrefix: _environment.default.modulePrefix,
    podModulePrefix: _environment.default.podModulePrefix
  };

  exports.default = resolver;
});
define('zmovizz/tests/helpers/start-app', ['exports', 'zmovizz/app', 'zmovizz/config/environment'], function (exports, _app, _environment) {
  'use strict';

  Object.defineProperty(exports, "__esModule", {
    value: true
  });
  exports.default = startApp;
  function startApp(attrs) {
    var attributes = Ember.merge({}, _environment.default.APP);
    attributes = Ember.merge(attributes, attrs); // use defaults, but you can override;

    return Ember.run(function () {
      var application = _app.default.create(attributes);
      application.setupForTesting();
      application.injectTestHelpers();
      return application;
    });
  }
});
define('zmovizz/tests/integration/components/individual-movie-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('individual-movie', 'Integration | Component | individual movie', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "0fHXclZb",
      "block": "{\"statements\":[[1,[26,[\"individual-movie\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "SLjVFC5y",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"individual-movie\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/movie-list-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('movie-list', 'Integration | Component | movie list', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "hk9HDSNL",
      "block": "{\"statements\":[[1,[26,[\"movie-list\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "DyVQzRAb",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"movie-list\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/side-nav-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('side-nav', 'Integration | Component | side nav', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "v3zFbtCP",
      "block": "{\"statements\":[[1,[26,[\"side-nav\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "4DVDgUm+",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"side-nav\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/theater-seating-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('theater-seating', 'Integration | Component | theater seating', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "IYvx3vVF",
      "block": "{\"statements\":[[1,[26,[\"theater-seating\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "3DPUeHnK",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"theater-seating\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/top-nav-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('top-nav', 'Integration | Component | top nav', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "k/6vg9Fy",
      "block": "{\"statements\":[[1,[26,[\"top-nav\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "ePBRzMHV",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"top-nav\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/helpers/check-exist-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('check-exist', 'helper:check-exist', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "E0z0vz/i",
      "block": "{\"statements\":[[1,[33,[\"check-exist\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/concat-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('concat', 'helper:concat', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "v5p/cP+F",
      "block": "{\"statements\":[[1,[33,[\"concat\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/millis-to-date-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('millis-to-date', 'helper:millis-to-date', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "emicvaTd",
      "block": "{\"statements\":[[1,[33,[\"millis-to-date\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/millis-to-full-date-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('millis-to-full-date', 'helper:millis-to-full-date', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "1oaYdp8C",
      "block": "{\"statements\":[[1,[33,[\"millis-to-full-date\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/millis-to-month-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('millis-to-month', 'helper:millis-to-month', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "qTrRZuSA",
      "block": "{\"statements\":[[1,[33,[\"millis-to-month\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/millis-to-time-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('millis-to-time', 'helper:millis-to-time', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "Fy1yDaN3",
      "block": "{\"statements\":[[1,[33,[\"millis-to-time\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/range-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('range', 'helper:range', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "UJ7HN/VG",
      "block": "{\"statements\":[[1,[33,[\"range\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/split-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('split', 'helper:split', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "Di9k7/et",
      "block": "{\"statements\":[[1,[33,[\"split\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/integration/helpers/time-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('time', 'helper:time', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "J9VsNT4/",
      "block": "{\"statements\":[[1,[33,[\"time\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
  });
});
define('zmovizz/tests/test-helper', ['zmovizz/tests/helpers/resolver', 'ember-qunit', 'ember-cli-qunit'], function (_resolver, _emberQunit, _emberCliQunit) {
  'use strict';

  (0, _emberQunit.setResolver)(_resolver.default);
  (0, _emberCliQunit.start)();
});
define('zmovizz/tests/tests.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | tests');

  QUnit.test('helpers/destroy-app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/destroy-app.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/module-for-acceptance.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/module-for-acceptance.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/resolver.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/resolver.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/start-app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/start-app.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/individual-movie-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/individual-movie-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/movie-list-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/movie-list-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/side-nav-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/side-nav-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/theater-seating-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/theater-seating-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/top-nav-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/top-nav-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/check-exist-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/check-exist-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/concat-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/concat-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/millis-to-date-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/millis-to-date-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/millis-to-full-date-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/millis-to-full-date-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/millis-to-month-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/millis-to-month-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/millis-to-time-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/millis-to-time-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/range-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/range-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/split-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/split-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/helpers/time-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/time-test.js should pass ESLint\n\n');
  });

  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/movies-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/movies-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/show-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/show-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmovizz/home-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmovizz/home-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/movies-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/movies-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz.movies-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz.movies-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/app-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/app-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/app/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/app/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/movies-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/movies-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/shows-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/shows-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmovizz/home-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmovizz/home-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/movie-fetch-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/movie-fetch-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/session-manager-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/session-manager-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/show-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/show-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/theater-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/theater-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/time-converter-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/time-converter-test.js should pass ESLint\n\n');
  });
});
define('zmovizz/tests/unit/controllers/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:login', 'Unit | Controller | login', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz', 'Unit | Controller | zmoviezz', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/login', 'Unit | Controller | zmoviezz/login', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz/movies-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/movies', 'Unit | Controller | zmoviezz/movies', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz/show-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/show', 'Unit | Controller | zmoviezz/show', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmovizz/home-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmovizz/home', 'Unit | Controller | zmovizz/home', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/routes/movies-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:movies', 'Unit | Route | movies', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz', 'Unit | Route | zmoviezz', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz.movies-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz.movies', 'Unit | Route | zmoviezz.movies', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/app-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/app', 'Unit | Route | zmoviezz/app', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/app/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/app/login', 'Unit | Route | zmoviezz/app/login', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/movies-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/movies', 'Unit | Route | zmoviezz/movies', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/shows-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/shows', 'Unit | Route | zmoviezz/shows', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmovizz/home-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmovizz/home', 'Unit | Route | zmovizz/home', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/services/login-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:login', 'Unit | Service | login', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/movie-fetch-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:movie-fetch', 'Unit | Service | movie fetch', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/session-manager-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:session-manager', 'Unit | Service | session manager', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/show-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:show-crud', 'Unit | Service | show crud', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/theater-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:theater-crud', 'Unit | Service | theater crud', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/time-converter-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:time-converter', 'Unit | Service | time converter', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
require('zmovizz/tests/test-helper');
EmberENV.TESTS_FILE_LOADED = true;
//# sourceMappingURL=tests.map
