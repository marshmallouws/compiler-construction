ANTLRJAR = `cygpath -w $(HOME)/antlr-4.9.2-complete.jar`

antlr4 = java.exe -jar $(ANTLRJAR)
grun = java.exe org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

all:	
	make grun

ccLexer.java:	cc.g4
	$(antlr4) cc.g4

ccLexer.class:	ccLexer.java
	javac $(GENERATED)

grun:	ccLexer.class cc.txt
	$(grun) cc start -gui -tokens cc.txt 
