public class IoC {
    public static void main(String[] args) {

        IoC container = new IoC();
        User user = container.new User(container.new MySqlDataBase());
        user.add("Get data");
    }

    public class User {
        Database database;

        public User(Database database) {
            this.database = database;
        }

        public void add(String data) {
            database.persist(data);
        }

    }

    public interface Database {
        void persist(String data);
    }

    public class MySqlDataBase implements Database {

        @Override
        public void persist(String data) {
            System.out.println("MySql Database "+ data);
        }
    }

    public class OracleDataBase implements Database {

        @Override
        public void persist(String data) {
            System.out.println("Oracle Database "+ data);
        }
    }
}
