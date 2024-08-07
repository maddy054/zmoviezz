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
    assert.ok(false, 'components/create-comp.js should pass ESLint\n\n76:11 - Unexpected console statement. (no-console)\n95:17 - Unexpected console statement. (no-console)\n106:13 - Unexpected console statement. (no-console)\n124:16 - \'error\' is defined but never used. (no-unused-vars)\n140:26 - \'error\' is defined but never used. (no-unused-vars)\n180:20 - Unexpected console statement. (no-console)\n238:17 - \'i\' is already defined. (no-redeclare)');
  });

  QUnit.test('components/individual-movie.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/individual-movie.js should pass ESLint\n\n');
  });

  QUnit.test('components/login-page.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/login-page.js should pass ESLint\n\n');
  });

  QUnit.test('components/manager-dash.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/manager-dash.js should pass ESLint\n\n');
  });

  QUnit.test('components/movie-list.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/movie-list.js should pass ESLint\n\n25:8 - Unexpected console statement. (no-console)\n27:9 - Unexpected console statement. (no-console)\n45:13 - \'$\' is not defined. (no-undef)\n58:18 - \'error\' is defined but never used. (no-unused-vars)\n59:21 - Unexpected console statement. (no-console)\n59:42 - \'data\' is not defined. (no-undef)');
  });

  QUnit.test('components/review-component.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/review-component.js should pass ESLint\n\n60:18 - \'data\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('components/show-component.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/show-component.js should pass ESLint\n\n40:5 - Duplicate key \'show\'. (no-dupe-keys)');
  });

  QUnit.test('components/side-nav.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/side-nav.js should pass ESLint\n\n');
  });

  QUnit.test('components/theater-seating.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'components/theater-seating.js should pass ESLint\n\n');
  });

  QUnit.test('components/top-nav.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'components/top-nav.js should pass ESLint\n\n25:18 - \'data\' is defined but never used. (no-unused-vars)\n29:21 - Unexpected console statement. (no-console)');
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
    assert.ok(false, 'controllers/zmoviezz/home.js should pass ESLint\n\n28:9 - Unexpected console statement. (no-console)\n34:7 - Duplicate key \'redirectToHome\'. (no-dupe-keys)');
  });

  QUnit.test('controllers/zmoviezz/login.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/login.js should pass ESLint\n\n29:17 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/zmoviezz/movies.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz/movies.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz/movies/movie-detail.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz/movies/movie-detail.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz/movies/movie-detail/theaters.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/movies/movie-detail/theaters.js should pass ESLint\n\n52:18 - \'error\' is defined but never used. (no-unused-vars)\n70:13 - Unexpected console statement. (no-console)\n86:18 - \'error\' is defined but never used. (no-unused-vars)');
  });

  QUnit.test('controllers/zmoviezz/shows.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'controllers/zmoviezz/shows.js should pass ESLint\n\n55:80 - \'index\' is not defined. (no-undef)\n74:13 - Unexpected console statement. (no-console)');
  });

  QUnit.test('controllers/zmoviezz/signup.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz/signup.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz/theaters.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz/theaters.js should pass ESLint\n\n');
  });

  QUnit.test('helpers/add.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/add.js should pass ESLint\n\n');
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

  QUnit.test('helpers/percentage.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'helpers/percentage.js should pass ESLint\n\n');
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
    assert.ok(true, 'routes/zmoviezz/movies.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/movies/movie-detail.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/movies/movie-detail.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/movies/movie-detail/theaters.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/movies/movie-detail/theaters.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/shows.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/shows.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/signup.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/signup.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/theaters.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/theaters.js should pass ESLint\n\n');
  });

  QUnit.test('services/authenticate.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/authenticate.js should pass ESLint\n\n15:18 - \'Promise\' is not defined. (no-undef)\n16:9 - \'$\' is not defined. (no-undef)\n35:18 - \'Promise\' is not defined. (no-undef)\n36:9 - \'$\' is not defined. (no-undef)\n56:18 - \'Promise\' is not defined. (no-undef)\n56:43 - \'reject\' is defined but never used. (no-unused-vars)\n57:9 - \'$\' is not defined. (no-undef)\n74:13 - \'reject\' is not defined. (no-undef)\n88:7 - \'returnthis\' is not defined. (no-undef)');
  });

  QUnit.test('services/location-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/location-crud.js should pass ESLint\n\n6:20 - \'Promise\' is not defined. (no-undef)\n7:13 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/movie-fetch.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/movie-fetch.js should pass ESLint\n\n17:18 - \'Promise\' is not defined. (no-undef)\n18:11 - \'$\' is not defined. (no-undef)\n37:16 - \'Promise\' is not defined. (no-undef)\n38:9 - \'$\' is not defined. (no-undef)\n56:14 - \'Promise\' is not defined. (no-undef)\n57:5 - \'$\' is not defined. (no-undef)\n77:20 - \'Promise\' is not defined. (no-undef)\n78:9 - \'$\' is not defined. (no-undef)\n97:18 - \'Promise\' is not defined. (no-undef)\n98:7 - \'$\' is not defined. (no-undef)\n116:20 - \'Promise\' is not defined. (no-undef)\n117:11 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/payment-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/payment-crud.js should pass ESLint\n\n6:20 - \'Promise\' is not defined. (no-undef)\n7:13 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/review-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/review-crud.js should pass ESLint\n\n11:20 - \'Promise\' is not defined. (no-undef)\n12:13 - \'$\' is not defined. (no-undef)\n33:20 - \'Promise\' is not defined. (no-undef)\n40:13 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/session.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/session.js should pass ESLint\n\n10:5 - Unexpected console statement. (no-console)\n12:5 - Unexpected console statement. (no-console)\n14:5 - Unexpected console statement. (no-console)');
  });

  QUnit.test('services/show-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/show-crud.js should pass ESLint\n\n9:20 - \'Promise\' is not defined. (no-undef)\n10:13 - \'$\' is not defined. (no-undef)\n29:13 - \'$\' is not defined. (no-undef)\n51:11 - \'$\' is not defined. (no-undef)\n71:18 - \'Promise\' is not defined. (no-undef)\n72:9 - \'$\' is not defined. (no-undef)\n93:9 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/theater-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/theater-crud.js should pass ESLint\n\n6:20 - \'Promise\' is not defined. (no-undef)\n7:13 - \'$\' is not defined. (no-undef)\n26:18 - \'Promise\' is not defined. (no-undef)\n28:9 - \'$\' is not defined. (no-undef)\n48:18 - \'Promise\' is not defined. (no-undef)\n49:11 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/ticket-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/ticket-crud.js should pass ESLint\n\n8:13 - \'$\' is not defined. (no-undef)\n27:20 - \'Promise\' is not defined. (no-undef)\n28:11 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/time-converter.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'services/time-converter.js should pass ESLint\n\n');
  });

  QUnit.test('services/user-crud.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/user-crud.js should pass ESLint\n\n7:20 - \'Promise\' is not defined. (no-undef)\n8:13 - \'$\' is not defined. (no-undef)');
  });

  QUnit.test('services/validation.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'services/validation.js should pass ESLint\n\n');
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
define('zmovizz/tests/integration/components/login-page-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('login-page', 'Integration | Component | login page', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "MN6uxQbC",
      "block": "{\"statements\":[[1,[26,[\"login-page\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "1c/loGdJ",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"login-page\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/manager-dash-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('manager-dash', 'Integration | Component | manager dash', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "n4JZfwFF",
      "block": "{\"statements\":[[1,[26,[\"manager-dash\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "Tt9ce9vo",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"manager-dash\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
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
define('zmovizz/tests/integration/components/review-component-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('review-component', 'Integration | Component | review component', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "ZIlmjLzj",
      "block": "{\"statements\":[[1,[26,[\"review-component\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "ZPkwgggd",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"review-component\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), 'template block text');
  });
});
define('zmovizz/tests/integration/components/show-component-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('show-component', 'Integration | Component | show component', {
    integration: true
  });

  (0, _emberQunit.test)('it renders', function (assert) {

    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.on('myAction', function(val) { ... });

    this.render(Ember.HTMLBars.template({
      "id": "+eCDbogU",
      "block": "{\"statements\":[[1,[26,[\"show-component\"]],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '');

    // Template block usage:
    this.render(Ember.HTMLBars.template({
      "id": "9k0VGmaA",
      "block": "{\"statements\":[[0,\"\\n\"],[6,[\"show-component\"],null,null,{\"statements\":[[0,\"      template block text\\n\"]],\"locals\":[]},null],[0,\"  \"]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
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
define('zmovizz/tests/integration/helpers/add-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('add', 'helper:add', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "2wJ7vnMJ",
      "block": "{\"statements\":[[1,[33,[\"add\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
      "meta": {}
    }));

    assert.equal(this.$().text().trim(), '1234');
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
define('zmovizz/tests/integration/helpers/percentage-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleForComponent)('percentage', 'helper:percentage', {
    integration: true
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it renders', function (assert) {
    this.set('inputValue', '1234');

    this.render(Ember.HTMLBars.template({
      "id": "ZLVHf32J",
      "block": "{\"statements\":[[1,[33,[\"percentage\"],[[28,[\"inputValue\"]]],null],false]],\"locals\":[],\"named\":[],\"yields\":[],\"hasPartials\":false}",
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

  QUnit.test('integration/components/login-page-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/login-page-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/manager-dash-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/manager-dash-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/movie-list-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/movie-list-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/review-component-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/review-component-test.js should pass ESLint\n\n');
  });

  QUnit.test('integration/components/show-component-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/components/show-component-test.js should pass ESLint\n\n');
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

  QUnit.test('integration/helpers/add-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/add-test.js should pass ESLint\n\n');
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

  QUnit.test('integration/helpers/percentage-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'integration/helpers/percentage-test.js should pass ESLint\n\n');
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

  QUnit.test('unit/controllers/zmoviezz/movie/movie-detail-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/movie/movie-detail-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/movies-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/movies-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/movies/movie-detail-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/movies/movie-detail-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/movies/movie-detail/theaters-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/movies/movie-detail/theaters-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/show-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/show-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/signup-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/signup-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz/theaters-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz/theaters-test.js should pass ESLint\n\n');
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

  QUnit.test('unit/routes/zmoviezz/movies/movie-detail-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/movies/movie-detail-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/movies/movie-detail/theaters-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/movies/movie-detail/theaters-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/movies/movie-id/theaters-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/movies/movie-id/theaters-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/shows-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/shows-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/signup-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/signup-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmoviezz/theaters-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmoviezz/theaters-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/routes/zmovizz/home-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/routes/zmovizz/home-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/location-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/location-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/login-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/movie-fetch-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/movie-fetch-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/payment-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/payment-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/review-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/review-crud-test.js should pass ESLint\n\n');
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

  QUnit.test('unit/services/ticket-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/ticket-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/time-converter-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/time-converter-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/user-crud-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/user-crud-test.js should pass ESLint\n\n');
  });

  QUnit.test('unit/services/validation-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/validation-test.js should pass ESLint\n\n');
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
define('zmovizz/tests/unit/controllers/zmoviezz/movie/movie-detail-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/movie/movie-detail', 'Unit | Controller | zmoviezz/movie/movie detail', {
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
define('zmovizz/tests/unit/controllers/zmoviezz/movies/movie-detail-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/movies/movie-detail', 'Unit | Controller | zmoviezz/movies/movie detail', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz/movies/movie-detail/theaters-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/movies/movie-detail/theaters', 'Unit | Controller | zmoviezz/movies/movie detail/theaters', {
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
define('zmovizz/tests/unit/controllers/zmoviezz/signup-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/signup', 'Unit | Controller | zmoviezz/signup', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var controller = this.subject();
    assert.ok(controller);
  });
});
define('zmovizz/tests/unit/controllers/zmoviezz/theaters-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('controller:zmoviezz/theaters', 'Unit | Controller | zmoviezz/theaters', {
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
define('zmovizz/tests/unit/routes/zmoviezz/movies/movie-detail-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/movies/movie-detail', 'Unit | Route | zmoviezz/movies/movie detail', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/movies/movie-detail/theaters-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/movies/movie-detail/theaters', 'Unit | Route | zmoviezz/movies/movie detail/theaters', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/movies/movie-id/theaters-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/movies/movie-id/theaters', 'Unit | Route | zmoviezz/movies/movie id/theaters', {
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
define('zmovizz/tests/unit/routes/zmoviezz/signup-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:zmoviezz/signup', 'Unit | Route | zmoviezz/signup', {
    // Specify the other units that are required for this test.
    // needs: ['controller:foo']
  });

  (0, _emberQunit.test)('it exists', function (assert) {
    var route = this.subject();
    assert.ok(route);
  });
});
define('zmovizz/tests/unit/routes/zmoviezz/theaters-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('route:/zmoviezz/theaters', 'Unit | Route | /zmoviezz/theaters', {
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
define('zmovizz/tests/unit/services/location-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:location-crud', 'Unit | Service | location crud', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
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
define('zmovizz/tests/unit/services/payment-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:payment-crud', 'Unit | Service | payment crud', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/review-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:review-crud', 'Unit | Service | review crud', {
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
define('zmovizz/tests/unit/services/ticket-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:ticket-crud', 'Unit | Service | ticket crud', {
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
define('zmovizz/tests/unit/services/user-crud-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:user-crud', 'Unit | Service | user crud', {
    // Specify the other units that are required for this test.
    // needs: ['service:foo']
  });

  // Replace this with your real tests.
  (0, _emberQunit.test)('it exists', function (assert) {
    var service = this.subject();
    assert.ok(service);
  });
});
define('zmovizz/tests/unit/services/validation-test', ['ember-qunit'], function (_emberQunit) {
  'use strict';

  (0, _emberQunit.moduleFor)('service:validation', 'Unit | Service | validation', {
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
