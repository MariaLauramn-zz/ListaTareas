//const toDoList = document.querySelector("#stuffList");
//const input= $("#txtTask"); /*crea constante del input*/
//const boton= $("#btnAdd");
//const table= $("#tblList");

const input = document.getElementById("input");
const boton = document.getElementById("boton");
const table = document.getElementById("table");

function addTask (){
    const row = document.createElement("tr");
    row.innerHTML =`
            <td> <input class="circle" onClick= "borrar()" type="radio"/></td>
            <td> ${input.value}</td>
                    `;
    table.appendChild(row); //inserte una fila nueva a la table
    input.value="";
}
boton.addEventListener("click", addTask);

let loadList = () =>{
    fetch ("/task")
        .then(response => response.json())
        .then(addTask)};

document.addEventListener("DOMContentLoaded", loadList)

function borrar(){
    this.event.target.parentElement.parentElement.remove();
}

boton.addEventListener("click", borrar);

