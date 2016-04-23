'use strict';

// DRY роутинг в AngularJS:  https://habrahabr.ru/post/190958/
var myApp = angular.module('myApp', ["ngRoute"]).config(function ($routeProvider) {

    // ************  Home Page  ******************  

    $routeProvider.when('/home',
        {
            templateUrl: 'home.html',
            controller: 'homeController'
        });

    $routeProvider.when('/create',
        {
            templateUrl: 'create.html',
            controller: 'createController'
        });

    $routeProvider.when('/update',
        {
            templateUrl: 'update.html',
            controller: 'updateController'
        });

    $routeProvider.when('/delete',
        {
            templateUrl: 'delete.html',
            controller: 'deleteController'
        });


    $routeProvider.otherwise({redirectTo: '/home'});

});

angular.module('myApp')
    .directive('bsActiveLink', ['$location', function ($location) {
        return {
            restrict: 'A', //use as attribute
            replace: false,
            link: function (scope, elem) {
                //after the route has changed
                scope.$on("$routeChangeSuccess", function () {
                    var hrefs = ['/#' + $location.path(),
                        '#' + $location.path(), //html5: false
                        $location.path()]; //html5: true
                    angular.forEach(elem.find('a'), function (a) {
                        a = angular.element(a);
                        if (-1 !== hrefs.indexOf(a.attr('href'))) {
                            a.parent().addClass('active');
                        } else {
                            a.parent().removeClass('active');
                        }
                        ;
                    });
                });
            }
        }
    }]);