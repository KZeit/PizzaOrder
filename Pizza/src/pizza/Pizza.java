package pizza;

public class Pizza 
{
    private int type;
    private int size;
    private double price;
    private int quantity;
    private double total;

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public double getPrice() 
    {
        return price;
    }
    
    public void setPrice(double price) 
    {
        this.price = price;
    }
    
    public double getTotal()
    {
    	return total = price * quantity;
    }
    
    public void setTotal(double total)
    {
    	this.total = total;
    }

    public int getSize() 
    {
        return size;
    }

    public void setSize(int size) 
    {
        this.size = size;
    }

    public int getType() 
    {
        return type;
    }

    public void setType(int type) 
    {
        this.type = type;
    }

}