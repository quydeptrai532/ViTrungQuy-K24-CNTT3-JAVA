package KT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product> {

    ArrayList<Product> list = new ArrayList<>();
    HashMap<String, Product> find = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) return false;
        list.add(item);
        find.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeByid(String id) {
        if (id == null || !find.containsKey(id)) return false;
        Product p = find.remove(id);
        list.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return find.get(id);
    }

    @Override
    public List<Product> findAll() {
        return list;
    }
}