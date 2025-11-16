abstract class DBOps {
    public void select(String sql) {
        System.out.println("SELECT OPERATION");
    }

    abstract public void insert(String sql);
    abstract public void update(String sql);
    abstract public void delete(String sql);
}

class MySQL extends DBOps {
    public void insert(String sql) {}
    public void update(String sql) {}
    public void delete(String sql) {}
}

interface DBConn {
    public void select();
    public void insert();
    public void update();
    public void delete();
}

class Oracle implements DBConn {

    public void select(String sql) {}
    public void insert(String sql) {}
    public void update(String sql) {}
    public void delete(String sql) {}
}

class Main {
    public static void main(String[] args) {
        MySQL obj = new MySQL();
        obj.select("SELECT * FROM employee");

        Oracle oracle_obj = new Oracle();
        oracle_obj.select();
    }
}
