var myApp = angular.module('myApp', ['ngRoute']);

myApp.controller('myCtrl', function($scope) {
    $scope.firstName= "John";
    $scope.lastName= "Doe";
}); 