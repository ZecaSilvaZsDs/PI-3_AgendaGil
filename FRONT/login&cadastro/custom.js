const formValidate = document.getElementById("form-validate");

if(formValidate){
    formValidate.addEventListener("submit", async (e) => {

        e.preventDefault();

        const listaDeInput = document.querySelectorAll(".input-form-validate");
        console.log(listaDeInput);

        for(let contador = 0; contador < listaDeInput.length; contador++){

            const inputField = listaDeInput[contador];
            console.log(inputField);
        }
    });
}