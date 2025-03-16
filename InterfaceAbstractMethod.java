package JavaNewProgram.JavaNewProgramDemo;
// Assignment 51 WAP on Interface with 2 Abstract methods
//Assignment 52 WAP on Multi Level Inheritance using Interface Concep


interface InterfaceAB2{
	abstract void s11();
}

interface InterfaceAB3 extends InterfaceAB2{
	abstract void s122();
}

interface InterfaceAbstractMethod extends InterfaceAB3{
	abstract void a22();
	void a33();
}
