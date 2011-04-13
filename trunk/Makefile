JC = javac -d bin/ -cp bin/ -Xlint
JC2 = javac -d bin/ -cp bin/



.PHONY: all clean absyn debug



all: bin/Main.class

debug: all bin/tester/SymbolTableTester.class bin/tester/ParserTester.class bin/tester/SementTester.class bin/tester/Mid.class

bin/Main.class: src/Main.java bin/parser/Parser.class bin/scanner/Scanner.class absyn bin/absyn/Printer.class bin/sement/Sement.class bin/error/ErrorMsg.class
	$(JC) src/Main.java

bin/tester/SymbolTableTester.class: src/tester/SymbolTableTester.java bin/symbol/Table.class bin/error/ErrorMsg.class
	$(JC) src/tester/SymbolTableTester.java

bin/tester/ParserTester.class: src/tester/ParserTester.java bin/parser/Parser.class absyn bin/error/ErrorMsg.class
	$(JC) src/tester/ParserTester.java

bin/tester/SementTester.class: src/tester/SementTester.java bin/parser/Parser.class absyn bin/sement/Sement.class
	$(JC) src/tester/SementTester.java

bin/tester/Mid.class: src/tester/Mid.java bin/parser/Parser.class absyn bin/sement/Sement.class
	$(JC) src/tester/Mid.java


bin/symbol/Symbol.class: src/symbol/Symbol.java
	$(JC) src/symbol/Symbol.java

bin/symbol/Table.class: src/symbol/Table.java bin/symbol/Symbol.class
	$(JC) src/symbol/Table.java

absyn: bin/absyn/Absyn.class bin/absyn/Expr.class bin/absyn/StringExpr.class bin/absyn/IntExpr.class bin/absyn/NilExpr.class bin/absyn/LValueExpr.class bin/absyn/NegationExpr.class bin/absyn/OpExpr.class bin/absyn/AssignmentExpr.class bin/absyn/CallExpr.class bin/absyn/SeqExpr.class bin/absyn/RecordExpr.class bin/absyn/ArrayExpr.class bin/absyn/IfExpr.class bin/absyn/WhileExpr.class bin/absyn/ForExpr.class bin/absyn/BreakExpr.class bin/absyn/LetExpr.class bin/absyn/TypeDecl.class bin/absyn/NameType.class bin/absyn/RecordType.class bin/absyn/ArrayType.class bin/absyn/VarDecl.class bin/absyn/FuncDecl.class bin/absyn/VarLValue.class bin/absyn/FieldLValue.class bin/absyn/SubscriptLValue.class

bin/absyn/ExprList.class: src/absyn/ExprList.java bin/absyn/Expr.class
	$(JC) src/absyn/ExprList.java

bin/absyn/FieldList.class: src/absyn/FieldList.java
	$(JC) src/absyn/FieldList.java

bin/absyn/DeclList.class: src/absyn/DeclList.java bin/absyn/Decl.class
	$(JC) src/absyn/DeclList.java

bin/absyn/Decl.class: src/absyn/Decl.java
	$(JC) src/absyn/Decl.java

bin/absyn/TypeDecl.class: src/absyn/TypeDecl.java bin/symbol/Symbol.class bin/absyn/Type.class
	$(JC) src/absyn/TypeDecl.java

bin/absyn/VarDecl.class: src/absyn/VarDecl.java bin/symbol/Symbol.class
	$(JC) src/absyn/VarDecl.java

bin/absyn/FuncDecl.class: src/absyn/FuncDecl.java bin/symbol/Symbol.class
	$(JC) src/absyn/FuncDecl.java

bin/absyn/Type.class: src/absyn/Type.java
	$(JC) src/absyn/Type.java

bin/absyn/NameType.class: src/absyn/NameType.java bin/absyn/Type.class bin/symbol/Symbol.class
	$(JC) src/absyn/NameType.java

bin/absyn/RecordType.class: src/absyn/RecordType.java bin/absyn/Type.class bin/absyn/TypeFields.class
	$(JC) src/absyn/RecordType.java

bin/absyn/ArrayType.class: src/absyn/ArrayType.java bin/absyn/Type.class bin/symbol/Symbol.class
	$(JC) src/absyn/ArrayType.java

bin/absyn/TypeFields.class: src/absyn/TypeFields.java bin/absyn/TypeField.class
	$(JC) src/absyn/TypeFields.java

bin/absyn/TypeField.class: src/absyn/TypeField.java bin/symbol/Symbol.class
	$(JC) src/absyn/TypeField.java

bin/absyn/LValue.class: src/absyn/LValue.java
	$(JC) src/absyn/LValue.java

bin/absyn/VarLValue.class: src/absyn/VarLValue.java bin/absyn/LValue.class bin/symbol/Symbol.class
	$(JC) src/absyn/VarLValue.java

bin/absyn/FieldLValue.class: src/absyn/FieldLValue.java bin/absyn/LValue.class bin/symbol/Symbol.class
	$(JC) src/absyn/FieldLValue.java

bin/absyn/SubscriptLValue.class: src/absyn/SubscriptLValue.java bin/absyn/LValue.class
	$(JC) src/absyn/SubscriptLValue.java

bin/absyn/Absyn.class: src/absyn/Absyn.java
	$(JC) src/absyn/Absyn.java

bin/absyn/Expr.class: src/absyn/Expr.java bin/absyn/Absyn.class
	$(JC) src/absyn/Expr.java

bin/absyn/StringExpr.class: src/absyn/StringExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/StringExpr.java

bin/absyn/IntExpr.class: src/absyn/IntExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/IntExpr.java

bin/absyn/NilExpr.class: src/absyn/NilExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/NilExpr.java

bin/absyn/LValueExpr.class: src/absyn/LValueExpr.java bin/absyn/Expr.class bin/absyn/LValue.class
	$(JC) src/absyn/LValueExpr.java

bin/absyn/NegationExpr.class: src/absyn/NegationExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/NegationExpr.java

bin/absyn/OpExpr.class: src/absyn/OpExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/OpExpr.java

bin/absyn/AssignmentExpr.class: src/absyn/AssignmentExpr.java bin/absyn/Expr.class bin/absyn/LValue.class
	$(JC) src/absyn/AssignmentExpr.java

bin/absyn/CallExpr.class: src/absyn/CallExpr.java bin/absyn/Expr.class bin/absyn/ExprList.class bin/symbol/Symbol.class
	$(JC) src/absyn/CallExpr.java

bin/absyn/SeqExpr.class: src/absyn/SeqExpr.java bin/absyn/Expr.class bin/absyn/ExprList.class
	$(JC) src/absyn/SeqExpr.java

bin/absyn/RecordExpr.class: src/absyn/RecordExpr.java bin/absyn/Expr.class bin/absyn/FieldList.class bin/symbol/Symbol.class
	$(JC) src/absyn/RecordExpr.java

bin/absyn/ArrayExpr.class: src/absyn/ArrayExpr.java bin/absyn/Expr.class bin/symbol/Symbol.class
	$(JC) src/absyn/ArrayExpr.java

bin/absyn/IfExpr.class: src/absyn/IfExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/IfExpr.java

bin/absyn/WhileExpr.class: src/absyn/WhileExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/WhileExpr.java

bin/absyn/ForExpr.class: src/absyn/ForExpr.java bin/absyn/Expr.class bin/symbol/Symbol.class
	$(JC) src/absyn/ForExpr.java

bin/absyn/BreakExpr.class: src/absyn/BreakExpr.java bin/absyn/Expr.class
	$(JC) src/absyn/BreakExpr.java

bin/absyn/LetExpr.class: src/absyn/LetExpr.java bin/absyn/Expr.class bin/absyn/DeclList.class bin/absyn/ExprList.class
	$(JC) src/absyn/LetExpr.java

bin/absyn/Printer.class: absyn src/absyn/Printer.java
	$(JC) src/absyn/Printer.java


bin/parser/sym.class: src/parser/sym.java
	$(JC) src/parser/sym.java

bin/scanner/Scanner.class: src/scanner/Scanner.java bin/parser/sym.class
	$(JC2) src/scanner/Scanner.java

bin/error/ErrorMsg.class: src/error/ErrorMsg.java
	$(JC) src/error/ErrorMsg.java

bin/parser/Parser.class: src/parser/Parser.java bin/parser/sym.class bin/error/ErrorMsg.class bin/scanner/Scanner.class absyn
	$(JC2) src/parser/Parser.java

src/scanner/Scanner.java: doc/scanner.jflex
	jflex -d src/scanner/ doc/scanner.jflex

src/parser/Parser.java: doc/parser.cup
	cd src/parser; java -jar ../../lib/java-cup-11a.jar -parser Parser ../../doc/parser.cup

src/parser/sym.java: doc/parser.cup
	cd src/parser; java -jar ../../lib/java-cup-11a.jar -parser Parser ../../doc/parser.cup


bin/sement/Sement.class: src/sement/Sement.java bin/type/Type.class bin/type/Int.class bin/type/String.class bin/type/Record.class bin/type/EmptyRecord.class bin/type/Array.class bin/type/Name.class bin/type/Nil.class bin/type/Void.class bin/symbol/Table.class bin/error/ErrorMsg.class bin/sement/Entry.class bin/translate/Expr.class bin/sement/TypedExpr.class absyn
	$(JC) src/sement/Sement.java

bin/sement/TypedExpr.class: src/sement/TypedExpr.java
	$(JC) src/sement/TypedExpr.java

bin/sement/Entry.class: src/sement/Entry.java
	$(JC) src/sement/Entry.java

bin/type/Type.class: src/type/Type.java
	$(JC) src/type/Type.java

bin/type/Int.class: src/type/Int.java bin/type/Type.class
	$(JC) src/type/Int.java

bin/type/String.class: src/type/String.java bin/type/Type.class
	$(JC) src/type/String.java

bin/type/Record.class: src/type/Record.java bin/type/Type.class bin/symbol/Symbol.class
	$(JC) src/type/Record.java

bin/type/EmptyRecord.class: src/type/EmptyRecord.java bin/type/Record.class
	$(JC) src/type/EmptyRecord.java

bin/type/Array.class: src/type/Array.java bin/type/Type.class
	$(JC) src/type/Array.java

bin/type/Nil.class: src/type/Nil.java bin/type/Type.class
	$(JC) src/type/Nil.java

bin/type/Void.class: src/type/Void.java bin/type/Type.class
	$(JC) src/type/Void.java

bin/type/Name.class: src/type/Name.java bin/type/Type.class bin/symbol/Symbol.class
	$(JC) src/type/Name.java


bin/translate/Expr.class: src/translate/Expr.java
	$(JC) src/translate/Expr.java


clean:
	rm -fR src/scanner/Scanner.java src/scanner/Scanner.java~ src/parser/Parser.java src/parser/sym.java bin/Main.class bin/parser bin/scanner bin/absyn bin/symbol bin/tester bin/type bin/sement bin/error bin/translate

