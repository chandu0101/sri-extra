window.ReactDOM = require('react-dom');
window.React    = require('react');
window.History    = require('history');

var injectTapEventPlugin = require('react-tap-event-plugin');
injectTapEventPlugin();

window.hljs = require("highlight.js");
require("highlight.js/styles/github.css");

//images

window.materialuiImage     = require("../images/mui.png");
