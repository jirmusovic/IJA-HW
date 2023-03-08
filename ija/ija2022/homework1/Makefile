PACKAGE=ija/ija2022/homework1
HOME=../../..

all: Homework1Test.java common/* game/*
	echo "RUNNING TESTS"
	cd $(HOME) && javac -cp .:junit-platform-console-standalone-1.6.0.jar $(PACKAGE)/Homework1Test.java
	cd $(HOME) && java -cp .:junit-platform-console-standalone-1.6.0.jar org.junit.runner.JUnitCore ija.ija2022.homework1.Homework1Test

pack:
	cd $(HOME) && zip xjirmu00.zip $(PACKAGE)/game/*.java $(PACKAGE)/common/*.java
