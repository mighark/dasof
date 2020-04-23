/**
 */
package centroscomerciales.provider;


import centroscomerciales.CentroscomercialesFactory;
import centroscomerciales.CentroscomercialesPackage;
import centroscomerciales.Planta;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link centroscomerciales.Planta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantaItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNumeroPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Numero feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumeroPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planta_numero_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planta_numero_feature", "_UI_Planta_type"),
				 CentroscomercialesPackage.Literals.PLANTA__NUMERO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS);
			childrenFeatures.add(CentroscomercialesPackage.Literals.PLANTA__PUERTAS);
			childrenFeatures.add(CentroscomercialesPackage.Literals.PLANTA__SALIDAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Planta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planta"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Planta planta = (Planta)object;
		return getString("_UI_Planta_type") + " " + planta.getNumero();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Planta.class)) {
			case CentroscomercialesPackage.PLANTA__NUMERO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CentroscomercialesPackage.PLANTA__ELEMENTOS:
			case CentroscomercialesPackage.PLANTA__PUERTAS:
			case CentroscomercialesPackage.PLANTA__SALIDAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createTienda()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createRestaurante()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createEscalera()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createAscensor()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createAseo()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createEspacioAbierto()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__ELEMENTOS,
				 CentroscomercialesFactory.eINSTANCE.createAparcamiento()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__PUERTAS,
				 CentroscomercialesFactory.eINSTANCE.createPuerta()));

		newChildDescriptors.add
			(createChildParameter
				(CentroscomercialesPackage.Literals.PLANTA__SALIDAS,
				 CentroscomercialesFactory.eINSTANCE.createSalida()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CentroscomercialesEditPlugin.INSTANCE;
	}

}
