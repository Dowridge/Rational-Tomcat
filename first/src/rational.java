public class rational {

public int num;
 private int denom;
 
 public int getn() {
return num;
	 }
 
 public void set(int n, int d) {

  num = n;
  denom = d;

 }

 public void minus(rational r1, rational r2) {

  int n = r1.num * r2.denom - r1.denom * r2.num;
  int d = r1.denom * r2.denom;
  set(n, d);
 }

 public void add(rational r1, rational r2) {

  int n = r1.num * r2.denom + r1.denom * r2.num;
  int d = r1.denom * r2.denom;
  set(n, d);

 }

 public void div(rational r1, rational r2) {
  int n = num * r2.denom;
  int d = denom * r2.num;
  set(n, d);
 }

 public void mul(rational r1, rational r2) {
  int n = r1.num * r2.num;
  int d = r1.denom * r2.denom;
  set(n, d);
 }

 public void gcd() {
  for (int i = num * denom; i > 1; i--) {
   if ((num % i) == 0 && (denom % i) == 0) {
    num = num / i;
    denom = denom / i;
   }
  }
 }

 public void display() {
  gcd();
  System.out.println(num + "/" + denom);
 }
 
 public String toString(){//overriding the toString() method 
	 gcd();
	 String ret = num + "/" + denom;
	  return ret;  
	 }  
  
}