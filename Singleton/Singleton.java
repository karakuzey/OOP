/**
 * Singleton
 * bu pattern da önemli nokta hem örneğin hemde metodun static olması yoksa
 * ulaşılamıyor
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // dışarıdan erişimi engellemek için kullanılan bi yöntem
    }

    // tek örneği döndüren statik metod
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        } else {
            return instance;
        }
    }

    public void showMessage() {
        // by şekilde farklı objeler oluşursa adresleri farklı olacak ve anlayacağim
        System.out.println(this.toString());
    }

}