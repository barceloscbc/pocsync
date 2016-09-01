var app = angular.module('app', [ 'ngRoute', 'ngMaterial', 'ngMdIcons',
		'angular-blocks', 'ngMessages' ]);

app.config(function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'views/home.html',
		controller : 'mainController',
	}).when('/sobre', {
		templateUrl : 'views/sobre.html',
		controller : 'SobreCtrl',
	}).when('/contato', {
		templateUrl : 'views/contato.html',
		controller : 'ContatoCtrl',
	}).otherwise({
		redirectTo : '/'
	});
});

app.config(function($mdThemingProvider) {
	var customBlueMap = $mdThemingProvider.extendPalette('light-blue', {
		'contrastDefaultColor' : 'light',
		'contrastDarkColors' : [ '50' ],
		'50' : 'ffffff'
	});
	$mdThemingProvider.definePalette('customBlue', customBlueMap);
	$mdThemingProvider.theme('default').primaryPalette('customBlue', {
		'default' : '500',
		'hue-1' : '50'
	}).accentPalette('pink');
	$mdThemingProvider.theme('input', 'default').primaryPalette('grey')
});