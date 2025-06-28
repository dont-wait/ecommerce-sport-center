import axios from 'axios';

const API_URL = "http://localhost:8080/api/v1";

const apiClient = axios.create({
    baseURL: API_URL,
    headers: {
        "Content-Type": "application/json",
        "Cache-Control": "no-cache, no-store, must-revalidate",
        "Pragma": "no-cache",
        "Expires": "0"
    },
    withCredentials: false
});

export { apiClient };