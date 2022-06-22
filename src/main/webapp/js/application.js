var ticTacToe = angular.module('ticTacToe', ['ngRoute','gameModule']);

handleVisibleState = () => {
      let vis = document.visibilityState === 'visible';
        console.log("visibilityState",vis)
        if (vis) {
          location.reload()
        } else {

        }
}



ticTacToe.config(['$routeProvider', function($routeProvider) {
    $routeProvider.
        when('/about', {
            templateUrl: 'templates/about.html'
        }).
        when('/player/create', {
            templateUrl: 'templates/create.html',
            controller: 'PlayerCreateController'
        }).
        when('/game/:id', {
            templateUrl: 'templates/game-board.html',
            controller: 'gameController'
        }).
        when('/player/panel', {
            templateUrl: 'templates/player-panel.html',
            controller: 'newGameController'
        }).
        otherwise({
            redirectTo: '/player/panel'
        });
}]);
