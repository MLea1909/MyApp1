package com.example.myapp1.repository

import com.example.myapp1.activities.RegistrationFragmentViewModel
import com.example.myapp1.model.Couple
import java.util.Arrays

class CoupleRepository {

    companion object {
        val COUPLES = ArrayList<RegistrationFragmentViewModel>()

        fun addCouple(newCouple: RegistrationFragmentViewModel) {
            COUPLES.add(newCouple)
        }

        fun getAll(): ArrayList<RegistrationFragmentViewModel> {
            //val couple = RegistrationFragmentViewModel();
            //couple.femaleDancer = "fdwerw"
            //couple.maleDancer = "fwr3e"
            //couple.coreographyName = "fwr3r"
            //couple.couplesCategoryName = "f3rq3e"

            //val list = ArrayList<RegistrationFragmentViewModel>()
            //list.add(couple)
            return COUPLES
        }
    }


}