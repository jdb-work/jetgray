Fit-Gradle
==========

[[ ![Codeship Status for jdb-work/jetgray](https://codeship.com/projects/f39bf470-660e-0132-c8b5-66851841475d/status?branch=master)](https://codeship.com/projects/52784)

Project template layout
-----------------------

The project's structure is laid out as follows

    <proj>
      |
      +- src
          |
          +- main
          |   |
          |   +- <jvm-lang-name>
          |   |    |
          |   |    +- package.tree
          |   |
          |   |          //application sources
          |   |
          |   +- resources
          |
          |        //application resources
          |
          +- test
              |
              +- <jvm-lang-name>
              |    |
              |    +- package.tree
              |
              |          //test sources
              |
              +- resources

                   //test resources


Execute the following command to compile and package the project

    ./gradlew build

