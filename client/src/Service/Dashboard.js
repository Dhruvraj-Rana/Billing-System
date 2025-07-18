import axios from "axios";

export const fetchDashboardData = async () => {
    return await axios.get(" http://localhost:8081/api/v1.0/dashboard", {headers: {'Authorization': `Bearer ${localStorage.getItem("token")}`}});
}

