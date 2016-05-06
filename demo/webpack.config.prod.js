'use strict';

var webpack = require('webpack');
var CommonsChunkPlugin = webpack.optimize.CommonsChunkPlugin;
var _ = require('lodash');
var NODE_ENV = process.env.NODE_ENV;


module.exports = _.merge(require('./webpack.config.js'), {

    output: {
        publicPath: "/sjrc/assets/"
    },
    plugins: [
        new CommonsChunkPlugin({
            name: "index"
        }),
        new webpack.DefinePlugin({
            'process.env': {
                'NODE_ENV': JSON.stringify('production')
            }
        }),
        new webpack.optimize.OccurenceOrderPlugin(),
        new webpack.optimize.DedupePlugin(),
        new webpack.optimize.UglifyJsPlugin({
            compress: {
                warnings: false,
                drop_console: true,
                hoist_vars: true,
                unsafe: true
            }
        })
    ]
});