## Collidium with Scala.js!

# Try it first

Launch the [game](http://collidium.shadaj.me)

# How to build

* Build scala-runtime.js using the [instructions](https://github.com/lampepfl/scala-js) and copy the resulting file to the js folder of this project

* Use sbt to build this project:

        $ sbt
        sbt> package-js


How to play
-----------
Run `node server.js`
Open localhost:3000/index-dev.html

Other Info
----------
* Uses [https://github.com/kripken/box2d.js](Box2d.js)!

* JSTypes.scala taken from the Reversi example and edited to add more types and methods as needed by my program

* Background music from [http://opengameart.org/content/metropolis-rush](http://opengameart.org/content/metropolis-rush)
