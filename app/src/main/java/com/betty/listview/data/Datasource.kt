package com.betty.listview.data

import com.betty.listview.model.Mail

class Datasource {
    fun loadMails(): List<Mail> {
        return listOf(
            Mail("$19 Only(First 10 spots)", "12:34 AM", "nguyenky@gmail.com"),
            Mail(
                "New Project Proposal",
                "11:34 PM",
                "project.manager@company.com"
            ),
            Mail("Travel Insurance Information", "09:15 AM", "travel@insuranceco.com"),
            Mail("Dinner Reservation Reminder", "01:20 PM", "restaurant@finedining.com"),
            Mail("Travel Insurance Information", "03:45 PM", "travel@insuranceco.com"),
            Mail("Coding Challenge Results", "05:55 PM", "recruitment@techco.com"),
            Mail("Special Offer Inside", "10:10 AM", "abcd@adventure.com"),
            Mail("Job Interview Confirmation", "6:40 PM", "hust@gmail.com"),
            Mail("Vacation Itinerary", "1:12 PM", "huhuhu@adventure.com"),
        )
    }
}