//
//  ViewController.swift
//  kotlinmppstarter
//
//  Created by tamura_k on 2019/04/25.
//  Copyright © 2019 KazaKago. All rights reserved.
//

import UIKit
import main

class ViewController: UIViewController {

    @IBOutlet weak var textField: UITextField!

    override func viewDidLoad() {
        super.viewDidLoad()
        load()
    }

    @IBAction func clickLoad(_ sender: Any) {
        load()
    }

    @IBAction func clickSave(_ sender: Any) {
        save()
    }

    private func load() {
        let preferences = Preferences()
        textField.text = preferences.name
    }

    private func save() {
        let preferences = Preferences()
        preferences.name = textField.text ?? ""
    }

}

