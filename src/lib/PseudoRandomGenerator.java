package src.lib;

import java.math.BigInteger;


public class PseudoRandomGenerator {

	private BigInteger seed;
	private BigInteger m;
	
	public PseudoRandomGenerator(String stringSeed){
		this.seed = new BigInteger(stringSeed);
		
		BigInteger p = new BigInteger("10359947");
		BigInteger q = new BigInteger("10359991");
		
		this.m = p.multiply(q);
	}
	
	public void generate(){
		this.seed = this.seed.multiply(this.seed);
		this.seed = this.seed.mod(this.m);
		
		System.out.println("Resultado: " + this.seed);
	}
}

