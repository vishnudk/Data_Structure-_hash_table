class hash_node{
    int key,value;
    hash_node(int k,int v) {
        key = k;
        value = v;
    }
}
 class hash_table{
    hash_node h[];
    int size;
    hash_table() {
        this.size=997;
      h=new hash_node[size];
    }
    public int hash_fn(int key){
        return (key%size);
    }
    public void insert_node(int key,int value){
        h[hash_fn(key)]=new hash_node(key,value);
    }
    public void print_hash_table(){
        for(int i=0;i<997;i++){
            if(h[hash_fn(i)]!=null){
                System.out.println("key value is : "+h[hash_fn(i)].key+" value is : "+h[hash_fn(i)].value);
            }
        }
    }
 }
public class hash_table_driver {
    public static void main(String[] args){
      hash_table h=new hash_table();

      for (int i=0;i<10;i++){
         // System.out.println("==================");
          h.insert_node(i,i+1);
      }
      h.print_hash_table();
    }
}
