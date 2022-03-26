const http =require('http');
const fs = require('fs');
const port =3000;
http.createServer((req,resp)=>{
   
const URL=req.url;
switch(URL){
    case '/':
        fs.readFile(__dirname+ '/index.html' , (err, data)=>{
            resp.setHeader('CONTENT-TYPE' ,'text/html');
            if(err)
            {
                resp.write(err);
            }
            else{
                resp.write(data);
            }
            resp.end();
        });
        break;
        
    default:
        resp.write(URL+"FILE NOT FOUND");
        resp.end();
        
        break;
}

}).listen(port , ()=>{
console.log(`http://localhost:${port} started`);
});