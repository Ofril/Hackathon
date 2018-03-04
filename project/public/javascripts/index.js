var myApp = angular.module('myApp', ['ngRoute']);

myApp.config([function ($routeProvider , $locationProvider)] {
    $routeProvider
        .when("/", {
            templateUrl: "../views/main.html",
            controller: "myCtrl"
        })
        .when("/advancedSearch", {
            templateUrl: "../views/Search.html",
            controller: 'searchController'
        })
        .when("/newAccount", {
            templateUrl: "../views/newAcount.html",
            controller: "newAcountController"
        })
        .when("/myAccount", {
            templateUrl: "../views/myAcount.html"
        })
        .otherwise({
            redirectTo: '/myAccount'
        });
              
    $locationProvider.html5Mode(true);
});

myApp.controller('myCtrl', function($scope) {
    
    $scope.firstName= "John";
    $scope.lastName= "Doe";
}); 