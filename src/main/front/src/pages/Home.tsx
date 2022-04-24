import React, {useEffect} from "react";
import axios from "axios";


export default function Home() {

    const [sec, setSec] = React.useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setSec(sec => sec + 1);
            axios.get('http://localhost:8080/api/home')
                .then(res => {
                    console.log('interval', res.data);
                })
                .catch(err => {
                    console.log(err);
                })
        }, 3000);
        return () => clearInterval(interval);
    }, [])


    return (
        <div className="container">
            <p>
                <p>{sec}</p>
                <p>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@</p>
            </p>
        </div>
    );
}