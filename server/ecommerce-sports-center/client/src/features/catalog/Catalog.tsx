import { useState, useEffect } from "react";
import { apiClient } from "../../api/axios";
import type { Product } from "../../app/models/Product";
import { useToast } from "../../hooks/useToast";
import ProductList from "./ProductList";

export default function Catalog() {
    const { showToast } = useToast();
    //Define a state variable products, using useState
    const [products, setProducts] = useState<Product[]>([]);

    useEffect(() => {
        const fetchProducts = async () => {
            try {
                const response = await apiClient.get("/products");
                setProducts(response.data.result);
            } catch (error) {
                showToast("Error fetching products", "error");
            }
        };
        if (!products.length) {
            fetchProducts();
            showToast("Successfully fetched products", "success");
        }
    }, []);

    return (
        <>
            <ProductList products={products} />
        </>
    );
}
