import { LightningElement } from 'lwc';

export default class QuizApp extends LightningElement {
    selected={}
    isSubmitted = false
    myQuestions=[
        {
            id:"Question1",
            question:"Which of the following is not a template loop?",
            options:{
                a:"for:each",
                b:"iterator",
                c:"map loop"
            },
            answer:"c"
        },
        {
            id:"Question2",
            question:"Which of the file is inalid in LWC?",
            options:{
                a:".svg",
                b:".apex",
                c:".js"
            },
            answer:"b"
        },
        {
            id:"Question3",
            question:"Which one of the followingis not a directive?",
            options:{
                a:"for:each",
                b:"if:true",
                c:"@track"
            },
            answer:"c"
        }
    ]

    get allNotSelected(){
        return !(Object.keys(this.selected).length === this.myQuestions.length)
    }

    get isScoredFull(){
        return `slds-text-heading_large ${this.myQuestions.length === this.correctAnswer?
            'slds-text-color_success':'slds-text-color_error'}` 
    }
    changeHandler(event){
        console.log("name",event.target.name)
        console.log("value",event.target.value)
        const {name, value} = event.target
        this.selected={...this.selected, [name]:value}
    }

    submitHandler(event){
        event.preventDefault()
        let correct = this.myQuestions.filter(item=>this.selected[item.id] === item.answer)
        this.correctAnswer = correct.length
        this.isSubmitted=true
        console.log("this.correctAnswer", this.correctAnswer)
    }

    resetHandler(){
        this.selected = {}
        this.correctAnswer=0
        this.isSubmitted=false
    }
}