var app = angular.module("standaloneAngular", []);
app.controller('firstController', function($scope) {
    $scope.requiredDetails = ['First Name', 'Last Name', 'Email Address', 'Contact No'];

    $scope.firstName = '';
    $scope.lastName = '';
    $scope.emailAddress = '';
    $scope.mobile = '';

    $scope.submitForm = function () {
        const data = {
            firstName: $scope.firstName,
            lastName: $scope.lastName,
            emailAddress: $scope.emailAddress,
            contactNo: $scope.mobile
        };
        $http.post({
            url: 'index/submitData',
            data: data
        }).success(function (resp) {
            console.log('Successfully saved the details');
        }).error(function (resp) {
           console.log('Error occurred while saving the details');
        });
    };
});