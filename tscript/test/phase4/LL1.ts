
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
isDuplicateNonTerminal = function fDuplicate(needle) {
	var q;
	q = 0;
	var flag;
	flag = false; 
	//print("Non-Terminals Count: " + nonTerminals.count);
	while (q < nonTerminals.count){
		//print("nonTerminals["+q+"] : " + nonTerminals[q] + " == " + needle + " is " + (nonTerminals[q] == needle));
		if (nonTerminals[q] == needle) {
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

var isNonTerminal;
isNonTerminal = function fIsNonTerminal(hay, needle) {
	//print ("entered fIsTerminal()"); 
	//print ("hay count: " + hay.count);
	//print ("needle: " + needle);
	var flag;
	flag = false;
	var s;
	s  = 0;
	while (s < hay.count) {
		if (hay[s] == needle) {
			flag = true;
		};
		s = s + 1;
	};
	return flag;
};

var isDuplicateTerminal;
isDuplicateTerminal = function fDupTerm(needle) {
	var q;
	q = 0;
	var flag;
	flag = false; 
	//print("Terminals Count: " + terminals.count);
	while (q < terminals.count){
		//print("terminals["+q+"] : " + terminals[q] + " == " + needle + " is " + (terminals[q] == needle));
		if (terminals[q] == needle) {
			flag = true;
		};
		q = q  + 1;
	};
	return flag;
};

var isNullDerivingSymbol;
isNullDerivingSymbol = function (hay, needle) {
	var flagNull;
	flagNull = false;
	var i;
	i = 0;
	//print("isNullDerivingSymbol: " + needle);
	while (i < hay.count) {
		//print(hay[i] + " == " + needle + " is " + (hay[i] == needle));
		if (hay[i] == needle) {
			flagNull == true;
			return true;
		};
		i = i + 1;
	};
	return flagNull;
};


// ************* Program Execution *************

printHeader();
print ("Grammar:");
var grammar;
grammar = getGrammarInput();
print(grammar.value); 

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
	bool = isDuplicateNonTerminal(productions[i][0]); 
	//print("bool is " + bool);
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
			var u;
			u = isDuplicateTerminal(productions[i][j]);
			if ( u == false ) {
				terminals[terminals.count] = productions[i][j];
				terminals.count = terminals.count + 1;
			};
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

var nullDerivingNonTerminals;
nullDerivingNonTerminals = new 42();
nullDerivingNonTerminals.count = 0;
i = 0;
while(i < productions.count) {
	if( productions[i].count == 1) {
		nullDerivingNonTerminals[nullDerivingNonTerminals.count] = productions[i][0]; 
		nullDerivingNonTerminals.count = nullDerivingNonTerminals.count + 1;
	};
	i = i + 1;
};
var nullDerivingNonTerminalsString;
nullDerivingNonTerminalsString = "{";
i = 0;
while (i < nullDerivingNonTerminals.count) {
	nullDerivingNonTerminalsString = nullDerivingNonTerminalsString + " " + nullDerivingNonTerminals[i];
	i = i + 1;
};
nullDerivingNonTerminalsString = nullDerivingNonTerminalsString + " } \n";
print ("Null-deriving Nonterminals: " + nullDerivingNonTerminalsString);

// determine first sets
var firstSets;
firstSets = new 42();
firstSets.count = nonTerminals.count; 

var firstFollow;
firstFollow = function ffirstFollow(origin, productionNumber, symbolNumber) {
	
	print("    Step 3: Computer the first of the specified symbol"); 
	print("    origin: " + origin + " productionNumber: " + productionNumber + " symbolNumber: " + symbolNumber ); 
	print("    symbol: " + productions[productionNumber][symbolNumber]);

	// if the symbol is a terminal, add the symbol to the origin first set
	// else if the current symbol is null deriving, then call firstFollow on the next symbol
	// if non-terminal 
	var isNT;
	isNT = isNonTerminal(nonTerminals, productions[productionNumber][symbolNumber]);
	if ( isNT == true ) {
		//print( origin + ", " + productionNumber + ", " + symbolNumber + ": " + productions[productionNumber][symbolNumber] + " is a non-terminal" );
		print("    non-terminal: " + isNT);
		// if null-deriving 
		var isND; 
		isND = isNullDerivingSymbol(nullDerivingNonTerminals, productions[productionNumber][symbolNumber]);
		print("    null-deriving: " + isND);
		if ( isND == true ) {
			//print( productions[productionNumber][symbolNumber] + " is null-deriving");
			//if (symbolNumber + 1 < productions[productionNumber].count ) {
				//print("follow null deriving symbol");
				print("    *Following " + productions[productionNumber][symbolNumber] + " to firstFollow(" + origin + ", " + productionNumber + ", " + (symbolNumber + 1) + ") ...\n");
				firstFollow(origin, productionNumber, symbolNumber + 1);
			//};
		}

		print("    null-deriving: " + isND);
		//print(productions[productionNumber][symbolNumber] + " is not null-deriving");
		// iterate through productions, call firstFollow on symbol match 
		var va;
		va = 0;
		while (va < productions.count) {
			if(productions[va][0] == productions[productionNumber][symbolNumber]) {
				print("    *Following " + productions[productionNumber][symbolNumber] + " to firstFollow(" + origin + ", " + va + ", " + 1 + ") ...\n");
				firstFollow(origin, va, 1);
			};
			va = va + 1;
		};
	};

	var isT;
	isT = isTerminal(productions, productions[productionNumber][symbolNumber]); 
	if ( isT == true ) {
		print("    non-terminal: " + isNT);
		print("    null-deriving: false");
		//print(productions[productionNumber][symbolNumber] + " is a terminal");
		print("    +Adding " + productions[productionNumber][symbolNumber] + " to " + "firstSets[" + origin + "][" + firstSets[origin].count + "] ");
		var c;
		var d;
		c = origin;
		d = firstSets[origin].count;
		var q;
		q = 0;
		var gh;
		gh = false;
		while (q < firstSets[origin].count){
			if(firstSets[origin][q] == productions[productionNumber][symbolNumber]){
				gh = true; 
			};
			q = q + 1;
		};
		if( gh == false ) {
			firstSets[c][d] = productions[productionNumber][symbolNumber]; 
			firstSets[c].count = firstSets[c].count + 1; 
		}; 
	};

	print("\n");

 
};

var calculateFirstSet;
calculateFirstSet = function (origin, nonTerminalSymbol ) {
	// for each production, look for the nonTerminalSymbol 
	// call first on each match
	print("  Step 2: Compute the first set where the non-terminal symbol matches a production");
	var i;
	i = 0;
	while (i < productions.count) {
		if(nonTerminalSymbol == productions[i][0]) {
			if(productions[i].count > 1) { 
				print("  origin: " + origin + " nonTerminalSymbol: " + nonTerminalSymbol); 
				print("  Matching Production: " + productionRows[i]);
				print("  " + productions[i][0] + " -> " + "firstFollow() with parameters " + origin + ", " + i + ", " + 1 + "\n");
				firstFollow(origin, i, 1);
			};
		};
		i = i + 1;
	};
};

// compute the first set for each non-terminal 
print("Step 1: Computer the set for each non-terminal symbol \n");
i = 0;
while (i < nonTerminals.count) { 
	firstSets[i].count = 0;
	firstSets[i] = nonTerminals[i];
	print ("NTS: " + nonTerminals[i] + " -> calculateFirstSet() with parameters " + i + " and " + nonTerminals[i] + "\n");
	calculateFirstSet(i, nonTerminals[i]);
	i = i + 1;
};

// print the first sets
var firstSetsString;
firstSetsString = "";
i = 0;
while (i < firstSets.count) {
	j = 0; 
	firstSetsString = firstSetsString + firstSets[i] + " : ";
	while (j < firstSets[i].count) {
		firstSetsString = firstSetsString + firstSets[i][j] + " ";
		j = j + 1;
	};
	firstSetsString = firstSetsString + "\n";
	i = i + 1;
};
firstSetsString = firstSetsString + "\n";
print ("\nFirst Sets: \n" + firstSetsString);

// determine follow sets

print ("Follow Set: ");








