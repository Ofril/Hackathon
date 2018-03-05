var myApp = angular.module('myApp', ["ngRoute"]);

myApp.config([('$routeProvider', '$locationProvider'), function($routeProvider, $locationProvider) {
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
}]);

myApp.controller('myCtrl', function($scope) {
    
    $scope.firstName= "John";
    $scope.lastName= "Doe";
}); 
              
myApp.config(function($routeProvider, $locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
    .when("/photo", {
        templateUrl : "Phothos.html"
    })
    .when("/shtap", {
        templateUrl : "Shatap.html"
    });
});

myApp.controller('photoCtrl', function($scope) {
    $scope.photos = [{"src":"1.png"},{"src":"2.png"},{"src":"3.png"},{"src":"4.png"},{"src":"5.png"}];
});
