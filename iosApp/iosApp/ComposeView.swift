
import Foundation
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        // ignore
    }

    func makeUIViewController(context: Context) -> some UIViewController {
        FactasticAppKt.MainViewController()
    }
}
