
// ************* Global Variables *************

var startSymbol; 
var productionCount; 
var getGrammarInput;

// ************* Funcitons *************

Grammar = function Grammar() {}; 

// gets the grammar input from the user 
getGrammarInput = function f() {
	var grammar;
	grammar = new Grammar();
	grammar.value = "";
	grammar.count = 0; 
	var production;
	while( production = readln() ){
		grammar.value = grammar.value + production; 
		grammar.count = grammar.count + 1; 
	}
	return grammar; 
};

// prints the header 
var printHeader = function g() {
	print ("********************************************************************************");
	print ("*                    CS 712 - Phase 4 - Eric Chamberlain                       *");
	print ("*                                                                              *");
	print ("*   Instructions: Input each production one line at a time, space delimited.   *");
	print ("*                 To end input, enter an empty / blank line.                   *");
	print ("********************************************************************************");
};


var isDuplicateNonTerminal;
isDuplicateNonTerminal = function fDuplicate(hay, needle) {
	var q;
	q = 0;
	var flag;
	flag = false; 
	while (q < hay.count){
		if (hay[q][0] == needle) {
			flag = true;
		};
		q = q  + 1;
	};
	return flag;
};

var isTerminal;
isTerminal = function fIsTerminal(hay, needle) {
	//print ("entered fIsTerminal()"); 
	//print ("hay count: " + hay.count);
	//print ("needle: " + needle);
	var flag;
	flag = true;
	var s;
	s  = 0;
	while (s < hay.count) {
		if (hay[s][0] == needle) {
			flag = false;
		};
		s = s + 1;
	};
	return flag;
};

// ************* Program Execution *************

printHeader();
print ("Grammar:");
var grammar;
grammar = getGrammarInput();


print ("Productions: ");
var productionRows;
productionRows = split(grammar.value, "\n");
var i;
i = 0;
var productions;
productions = new 42(); 
productions.count = productionRows.count; 
while (i < productionRows.count) {
	productions[i] = split(productionRows[i], " ");
	print (i + ": " + productionRows[i]);
	i = i + 1;
};
print ("\nProduction Count: " + productionRows.count + "\n");

print ("Symbols: ");
i = 0;
var j;
j = 0;
while( i < productions.count ) {
	j = 0;
	while ( j < productions[i].count) {
		print ("Production " + i + " Symbol " + j + " : " + productions[i][j]);
		j = j + 1;
	};
	i = i + 1;
};

// determine start symbol
startSymbol = productions[0][0];
print ("\nStart Symbol : " + startSymbol + "\n");

// determine nonterminals 
var nonTerminals;
nonTerminals = new 42();
nonTerminals.count = 0;
i = 0;
while (i < productions.count) {
	var bool;
	bool = isDuplicateNonTerminal(nonTerminals, productions[i][0]); 
	if ( bool == false ) {
		nonTerminals[nonTerminals.count] = productions[i][0];
		nonTerminals.count = nonTerminals.count + 1;
	};
	i = i + 1;
}

// print non-terminals 
var nonTerminalsString;
nonTerminalsString = "{";
i = 0;
while (i < nonTerminals.count) {
	nonTerminalsString = nonTerminalsString + " " + nonTerminals[i];
	i = i + 1;
};
nonTerminalsString = nonTerminalsString + " } \n";
print ("Non-terminals: " + nonTerminalsString);

// determine terminals
var terminals;
terminals = new 42();
terminals.count = 0;
i = 0;
var v;
while (i < productions.count) {
	j = 0;
	while (j < productions[i].count) {
		v = isTerminal(productions, productions[i][j]);
		if (v == true) {
			//print ("i: " + i + " j: " + j + " symbol: " + productions[i][j]);
			terminals[terminals.count] = productions[i][j];
			terminals.count = terminals.count + 1;
		};
		j = j + 1;
	};
	i = i + 1;
};

// print terminals 
var terminalsString;
terminalsString = "{";
i = 0;
while (i < terminals.count) {
	terminalsString = terminalsString + " " + terminals[i];
	i = i + 1;
};
terminalsString = terminalsString + " } \n";
print ("Terminals: " + terminalsString);


// determine null-deriving nonterminals

// determine first sets

// determine follow sets







