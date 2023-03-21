class Application {
    public static final int getSize = 0;

    public static void main(String[] args) {
        System.out.println("Hello World oh yeah!");
    }
    private int id;
    private static int lastedId;
    private String name;
    private String description;
    private int size;
    
    public Application(String name,String description,int size) {
        this.id = lastedId++;
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Application [id=" + id + ", name=" + name + ", description=" + description + ", size=" + size + "]";
    }

    
}