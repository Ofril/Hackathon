var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function($routeProvider) {
    $routeProvider
    .when("/advancedSearch", {
        templateUrl : "../views/Search.html"
    })
//       .otherwise({
//        template : "<h1>None</h1><p>Nothing has been selected</p>"
//    });
});
