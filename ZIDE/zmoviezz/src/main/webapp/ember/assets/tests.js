'use strict';

define('zmovizz/tests/app.lint-test', [], function () {
  'use strict';

  QUnit.module('ESLint | app');

  QUnit.test('app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'app.js should pass ESLint\n\n');
  });

  QUnit.test('controllers/zmoviezz.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'controllers/zmoviezz.js should pass ESLint\n\n');
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
    assert.ok(false, 'routes/zmoviezz.js should pass ESLint\n\n16:11 - Unexpected console statement. (no-console)');
  });

  QUnit.test('routes/zmoviezz/app.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/app.js should pass ESLint\n\n');
  });

  QUnit.test('routes/zmoviezz/app/login.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'routes/zmoviezz/app/login.js should pass ESLint\n\n');
  });

  QUnit.test('services/session.js', function (assert) {
    assert.expect(1);
    assert.ok(false, 'services/session.js should pass ESLint\n\n10:5 - Unexpected console statement. (no-console)\n12:5 - Unexpected console statement. (no-console)\n14:5 - Unexpected console statement. (no-console)');
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

  QUnit.test('test-helper.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'test-helper.js should pass ESLint\n\n');
  });

  QUnit.test('unit/controllers/zmoviezz-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/controllers/zmoviezz-test.js should pass ESLint\n\n');
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

  QUnit.test('unit/services/login-test.js', function (assert) {
    assert.expect(1);
    assert.ok(true, 'unit/services/login-test.js should pass ESLint\n\n');
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
require('zmovizz/tests/test-helper');
EmberENV.TESTS_FILE_LOADED = true;
//# sourceMappingURL=tests.map
