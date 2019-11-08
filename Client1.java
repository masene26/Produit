package com.jmd.test.dej.factory1;

public class Client {

  public static void main(String[] args) {
    ProduitFactory produitFactory1 = new ProduitFactory1();
    ProduitFactory produitFactory2 = new ProduitFactory2();

    ProduitA produitA = null;

    System.out.println("Utilisation de la premiere fabrique");
    produitA = produitFactory1.getProduitA();
    produitA.methodeA();

    System.out.println("Utilisation de la seconde fabrique");
    produitA = produitFactory2.getProduitA();
    produitA.methodeA();

  }
}
package com.jmd.test.dej.factory1;

public abstract class ProduitFactory {

  public ProduitA getProduitA() {
    return createProduitA();
  }

  protected abstract ProduitA createProduitA();
}

package com.jmd.test.dej.factory1;

public class ProduitFactory1 extends ProduitFactory {

  protected ProduitA createProduitA() {
    return new ProduitA1();
  }
}

package com.jmd.test.dej.factory1;

public class ProduitFactory2 extends ProduitFactory {

  protected ProduitA createProduitA() {
    return new ProduitA2();
  }
}

package com.jmd.test.dej.factory1;

public abstract class ProduitA {

  public abstract void methodeA();
}

package com.jmd.test.dej.factory1;

public class ProduitA1 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA1.methodeA()");
  }
}

package com.jmd.test.dej.factory1;

public class ProduitA2 extends ProduitA {

  public void methodeA() {
    System.out.println("ProduitA2.methodeA()");
  }
}