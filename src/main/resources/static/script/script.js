console.log("Script loaded")


let currentTheme= getTheme();

changeTheme();

//Change theme
function changeTheme(){
    
    
    const changeThemeButton=document.querySelector("#theme_change_button");
    changeTheme.addEventListener("click",(event)=>{
        
        const oldTheme=currentTheme;
        
        if(currentTheme=="dark"){
            currentTheme="light";
        }
        else{
            currentTheme="dark";
        }

        //update local storage
        setTheme(currentTheme);

        //remove old theme
        document.querySelector('html').classList.remove(oldTheme);

        //set the current theme

        document.querySelector('html').classList.add(currentTheme);



    });

}

//set theme to local storage
function setTheme(theme){
    localStorage.setItem("theme",theme);
}

//get theme from local storage
function getTheme(theme){
    let theme=localStorage.setItem("theme",theme);
    return theme ? theme : "light";

}