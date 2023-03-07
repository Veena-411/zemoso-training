var tableobj = {
  "1":[],
  "2":[],
  "3":[]
}

function searchMenu()
{
    let input = document.getElementById("search-menu").value;
    console.log(input);
    input = input.toLowerCase();
    let cards = document.querySelectorAll('.menu-item');
    for (i = 0; i < cards.length; i++) {
        if (!cards[i].innerHTML.toLowerCase().includes(input)) {
          cards[i].style.display = "none";
        } else {
          cards[i].style.display = "block";
        }
      }
}

function searchTable()
{
    let input = document.getElementById("search-table").value;
    console.log(input);
    input = input.toLowerCase();
    let table = document.querySelectorAll('.table-item');
    for (i = 0; i < table.length; i++) {
        if (!table[i].innerHTML.toLowerCase().includes(input)) {
          table[i].style.display = "none";
        } else {
          table[i].style.display = "block";

        }
      }
}

function allowDrop(ev) {
  ev.preventDefault();
}

function drag(ev) {
  ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev,id){
  console.log(id);
  ev.preventDefault();
  var mid = ev.dataTransfer.getData("text");
  let mitem = document.getElementById(mid);
  let itemName = mitem.querySelector("h3").innerHTML;
  let cost = mitem.querySelector("p").innerHTML;
  console.log(itemName)
  let obj = {
    "item":itemName,
    "cost":cost,
    "qty":1
  }
  tableobj[`${id}`].push(obj);
  let t_cost = calc(id);
  let n_table = document.getElementById(id);
  let p_all = n_table.querySelectorAll("p");
  p_all[0].innerHTML=`Rs.<span class="span">${t_cost}</span>`
  p_all[1].innerHTML=`Total items:<span id="total-items-1">${tableobj[`${id}`].length}</span>`;
  console.log(tableobj);

  
}

function clickTable(id)
{
     let this_div = document.getElementById(id);
     this_div.setAttribute("style","background-color:orange;");
     let tstart = `<div class="align-right">
     <h3>Table-${id} | Order Details</h3>
     <button id="close" onclick="clickClose(${id})"><i class="fa fa-close"></i></button>
     </div>
     <table>
      <tr>
        <th>S.No</th>
        <th>Item</th>
        <th>Price</th>
        <th><th>
        <th><th>
      </tr>`
     let n = tableobj[`${id}`].length;
     let arra =tableobj[`${id}`];
     for(let i=1;i<=n;i++)
     {
      tstart += `
                 <tr>
                    <td>${i}</td>
                    <td>${arra[i-1].item}</td>
                    <td>${arra[i-1].cost}</td>
                    <td><input type="number" id="quantity" min="1" max="10" value="1" onchange="valInc(${id},${i},this.value)"></td>
                    <td id="d${i}" onclick="DeleteRow(${id},${i})"><i class="fa fa-trash"></i></td>
                 </tr>`
     }
     let t_cost = calc(id);
     tstart += `<tr> <td></td> <td></td> <td>Total:<span class="span">${t_cost}</span></td></tr>`
     tstart += `</table>`
     tstart += `<button id="session-close" onclick="closeSession(${id})">Close Session(Generate Bill)</button>`
     console.log(tstart);
     let w_div = document.getElementById("window");
     w_div.innerHTML=tstart;

     w_div.style.display="block";
}

function clickClose(id){
  let w_div = document.getElementById("window");
  w_div.style.display="none";
  let this_div = document.getElementById(id);
     this_div.setAttribute("style","background-color:white;");

}
function clickClose2(){
  let w_div = document.getElementById("window2");
  let child = w_div.querySelector("#bill");
  w_div.removeChild(child);
  w_div.style.display="none";

}

function calc(id){
    let arr = tableobj[`${id}`];
    let sum = 0;
    for (let x of arr) {
      sum += (Number(x.cost)) * (Number(x.qty));
    }
    console.log(sum);
    return sum;
}

function closeSession(id){
   let new_d = document.createElement("div");
   let tt = calc(id);
   new_d.setAttribute("id","bill");
   let html = `<button id="close" onclick="clickClose2()"><i class="fa fa-close"></i></button>
               <h3 class="bill_w">Customer has to pay:</h3>
               <p class="bill_w" id="amount">Rs.<span>${tt}</span></p>
               <button id="done" onclick="Done(${id})">Done</button>`
  new_d.innerHTML=html;
  let win = document.getElementById("window2");
  win.appendChild(new_d);
  win.style.display="block";
    


}

function valInc(id,i,Ob){
  console.log(Ob);
  let arra =tableobj[`${id}`];
  let s_obj = arra[i-1];
  s_obj.qty = Ob;
  let tot_cost = calc(id);
  let spans = document.querySelectorAll(".span");
  for (const sp of spans) {
    console.log(sp);
    sp.innerHTML=tot_cost;
  }
  
}

function DeleteRow(id,index){
  let arra =tableobj[`${id}`];
  let del = arra.splice(index-1,1);
  console.log(arra);
  clickTable(id);
  let n_table = document.getElementById(id);
  let p_all = n_table.querySelectorAll("p");
  p_all[0].innerHTML=`Rs.<span class="span">${calc(id)}</span>`
  p_all[1].innerHTML=`Total items:<span id="total-items-1">${tableobj[`${id}`].length}</span>`;

}

function Done(id)
{
  clickClose(id);
  clickClose2();
  let Currarray = tableobj[`${id}`];
  while(Currarray.length>0)
  Currarray.pop();
  let this_div = document.getElementById(id);
  let p_all = this_div.querySelectorAll("p");
  p_all[0].innerHTML=`Rs.<span class="span">${calc(id)}</span>`
  p_all[1].innerHTML=`Total items:<span id="total-items-1">${tableobj[`${id}`].length}</span>`;

}

fetch("./data.json")
.then(res=> res.json())
.then((data)=> {console.log(data)
let menulist = data['Menu-list'];
var menu = document.getElementById("Menu-new");

for(let x of menulist)
{
    let div = `<h3>${x.itemName}</h3> <p>${x.cost}</p><p id="hide">${x.type}</p>`
    let child = document.createElement('div');
    child.innerHTML=div;
    child.setAttribute("id",x.id);
    child.setAttribute("class","menu-item")   //draggable="true" ondragstart="drag(event)"
    child.setAttribute("draggable","true")
    child.setAttribute("ondragstart","drag(event)")
    menu.appendChild(child);
}

var table = document.getElementById("Tables");
var tabledata = data.Tables;


for(let y of tabledata){
    let div = `<h2>${y.title}</h2> <p>Rs.${y.cost}</p> <p>Total items:${y['total items']}</p>`
    let child = document.createElement('div');
    child.innerHTML=div;
    child.setAttribute("id",y.id);
    child.setAttribute("class","table-item") //ondrop="drop(event)" ondragover="allowDrop(event)"
    child.setAttribute("ondrop",`drop(event,${y.id})`)
    child.setAttribute("ondragover","allowDrop(event)")
    child.setAttribute("onclick",`clickTable(${y.id});`)
    table.appendChild(child);
}


})
