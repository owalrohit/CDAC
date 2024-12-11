import express from 'express';
import { establishConnection } from './src/config/DbConfig.js';
import bookingRouter from './src/router/bookingRouter.js';
import cors from 'cors';


const app = express();
const PORT = 9600;
app.use(express.json());


app.get("/",(req,res) =>{

    res.send('hello from rohit');
});

app.use(cors({origin:' http://127.0.0.1:5500'}));
app.use("/booking",bookingRouter);


app.listen(PORT,()=>{
    console.log(`server running on http://127.0.0.1:${PORT} `);
    establishConnection();
});