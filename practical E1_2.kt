open class Product(
   val productName: String,
   val quantity: Int,
   val amountPerQuantity: Double
) {
   constructor(productName: String, amountPerQuantity: Double) : this(productName, 1, amountPerQuantity)


   fun productInfo(): String {
       return "Product: $productName, Quantity: $quantity, Amount per Qty: $amountPerQuantity"
   }
}


class Laptop(productName: String,quantity: Int,amountPerQuantity: Double,val cpuName: String,val ramSize: String,val hddSize: String) : Product(productName, quantity, amountPerQuantity) {
   constructor(
       productName: String,
       amountPerQuantity: Double,
       cpuName: String,
       ramSize: String,
       hddSize: String
   ) : this(productName, 1, amountPerQuantity, cpuName, ramSize, hddSize)


   fun laptopInfo(): String {
       return productInfo() + ", CPU: $cpuName, RAM: $ramSize, HDD: $hddSize"
   }
}


fun main() {
   val laptops = ArrayList<Laptop>()


   laptops.add(Laptop("Dell Inspiron", 5, 45000.0, "Intel i5", "8GB", "512GB SSD"))
   laptops.add(Laptop("HP Pavilion", 3, 55000.0, "Intel i7", "16GB", "1TB HDD"))
   laptops.add(Laptop("Lenovo ThinkPad", 2, 65000.0, "AMD Ryzen 5", "8GB", "512GB SSD"))
   laptops.add(Laptop("Asus VivoBook", 4, 40000.0, "Intel i3", "8GB", "1TB HDD"))
   laptops.add(Laptop("MacBook Air", 1, 95000.0, "Apple M1", "8GB", "256GB SSD"))


   for (laptop in laptops) {
       println(laptop.laptopInfo())
   }
}
