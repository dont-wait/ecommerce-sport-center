import { useEffect, useState } from "react";
import { apiClient } from "./api/axios";

const App = () => {
    
    //Define a state variable products, using useState
    const [products, setProducts] = useState([]);
    
    useEffect(() => {
        const fetchProducts = async () => {
            const response = await apiClient.get("/products");
            setProducts(response.data);
        };
        fetchProducts();
    }, []);

    return (
        <div>
            <h1>Product List</h1>
            {
                products.map((product) => (
                    <div key={product.id} className="product">
                        <h2>{product.name}</h2>
                        <p>Price: ${product.price}</p>
                    </div>
                ))}
        </div>
    );
}
export default App;