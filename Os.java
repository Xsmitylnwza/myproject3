import java.io.Externalizable;
import java.util.Arrays;

public class Os {
    private int id;
    private static int lastedId;
    private String name;
    private Application[] apps = new Application[10];
    private int storageSize;
    private int usedStorage;
    private int count = 0;

    public Os(String name,int storageSize){
        this.id = lastedId++;
        this.name = name;
        this.storageSize = storageSize;
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

    public Application[] getApps() {
        return apps;
    }

    public void setApps(Application[] apps) {
        this.apps = apps;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getUsedStorage() {
        return usedStorage;
    }

    public void setUsedStorage(int usedStorage) {
        this.usedStorage = usedStorage;
    }
    public boolean addApplication(Application newApps){
        if((this.usedStorage += newApps.getSize) < this.storageSize) {
            this.usedStorage += newApps.getSize();
            this.apps[count++] = newApps;
            System.out.println("Add complete");
            return true;
        }else System.out.println("Add fail full storage"); 
        return false;
    }
    public int removeApplication(int id){
        for(int i=0;i<apps.length;i++){
            if(apps[i].getId() == id){
                this.usedStorage -= apps[i].getSize();
                this.apps[i] = null;
                return 1;
            }
        }
        return -1;
    }
    public Application getApplicationByName(String name){
        for(int i =0;i<apps.length;i++){
            if(apps[i].getName() == name){
                return apps[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Os [id=" + id + ", name=" + name + ", apps=" + Arrays.toString(apps) + ", storageSize=" + storageSize
                + ", usedStorage=" + usedStorage + ", count=" + count + "]";
    }
    
}
