antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = timeListener.java timeBaseListener.java timeParser.java timeLexer.java

all:	
	make grun

timeLexer.java:	time.g4
	$(antlr4) time.g4

timeLexer.class:	timeLexer.java
	javac $(GENERATED)

grun:	timeLexer.class time.txt
	$(grun) time start -gui -tokens time.txt 
