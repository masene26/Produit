package com.jmd.test.dej.abstractfactory;

public class Client {

  public static void main(String[] args) {
    IProduitFactory produitFactory1 = new ProduitFactory1();
    IProduitFactory produitFactory2 = new ProduitFactory2();

    ProduitA produitA = null;
    ProduitB produitB = null;

    System.out.println("Utilisation de la premiere fabrique");
    produitA = produitFactory1.getProduitA();
    produitB = produitFactory1.getProduitB();
    produitA.methodeA();
    produitB.methodeB();

    System.out.println("Utilisation de la seconde fabrique");
    produitA = produitFactory2.getProduitA();
    produitB = produitFactory2.getProduitB();
    produitA.methodeA();
    produitB.methodeB();

  }
}

package com.jmd.test.dej.abstractfactory;

public interface IProduitFactory {

  public ProduitA getProduitA();
  public ProduitB getProduitB();
}


package com.jmd.test.dej.abstractfactory;

public class ProduitFactory1 implements IProduitFactory {

  public ProduitA getProduitA() {
    return new ProduitA1();
  }

  public ProduitB getProduitB() {
    return new ProduitB1();
  }
}

package com.jmd.test.dej.abstractfactory;

public class ProduitFactory2 implements IProduitFactory {

  public ProduitA getProduitA() {
    return new ProduitA2();
  }

  public ProduitB getProduitB() {
    return new ProduitB2();
  }
}

package com.jmd.test.dej.abstractfactory;

public abstract class ProduitA {

  public abstract void methodeA();
}

package com.jmd.test.dej.abstractfactory;

public class ProduitA1 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA1.methodeA()");
  }
}

package com.jmd.test.dej.abstractfactory;

public class ProduitA2 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA2.methodeA()");
  }
}

package com.jmd.test.dej.abstractfactory;

public abstract class ProduitB {

  public abstract void methodeB();
}

package com.jmd.test.dej.abstractfactory;

public class ProduitB1 extends ProduitB {

  public void methodeB() {
    System.out.println("ProduitB1.methodeB()");
  }
}

package com.jmd.test.dej.abstractfactory;

public class ProduitB2 extends ProduitB {

  public void methodeB() {
    System.out.println("ProduitB2.methodeB()");
  }
}