myApp.controller('searchController', ['$scope', function ($scope) {
    $scope.artistTypes = [{
            "id": 1,
            "artType": "photographer",
            "displayName": "צלם"
        },
        {
            "id": 2,
            "artType": "agent",
            "displayName": "סוכן"
        },
        {
            "id": 3,
            "artType": "musicion",
            "displayName": "מוזיקאי"
        },
        {
            "id": 4,
            "artType": "painter",
            "displayName": "צייר"
        },
        {
            "id": 5,
            "artType": "actor",
            "displayName": "שחקן"
        },
        {
            "id": 6,
            "artType": "sculptor",
            "displayName": "פסל"
        }];
}]);