var myApp = angular.module('myApp', ["ngRoute"]);

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